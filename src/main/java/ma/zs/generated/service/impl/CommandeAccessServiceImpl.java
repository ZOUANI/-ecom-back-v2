package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;

import ma.zs.generated.util.SearchUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.CommandeAccess;
import ma.zs.generated.bean.Command;
import ma.zs.generated.bean.User;
import ma.zs.generated.dao.CommandeAccessDao;
import ma.zs.generated.service.facade.CommandeAccessService;
import ma.zs.generated.service.facade.UserService;
import ma.zs.generated.service.facade.CommandService;

import ma.zs.generated.ws.rest.provided.vo.CommandeAccessVo;

@Service
public class CommandeAccessServiceImpl implements CommandeAccessService {

	@Autowired
	private CommandeAccessDao commandeAccessDao;

	@Autowired
	private UserService userService;
	@Autowired
	private CommandService commandService;

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<CommandeAccess> findAll(Long adminId) {
		return commandeAccessDao.findByValidatorSuperAdminId(adminId);
	}

	@Override
	public List<CommandeAccess> findByCommandReference(String reference) {
		return commandeAccessDao.findByCommandReference(reference);
	}

	@Override
	@Transactional
	public int deleteByCommandReference(String reference) {
		return commandeAccessDao.deleteByCommandReference(reference);
	}

	@Override
	public List<CommandeAccess> findByCommandId(Long id) {
		return commandeAccessDao.findByCommandId(id);

	}

	@Override
	@Transactional
	public int deleteByCommandId(Long id) {
		return commandeAccessDao.deleteByCommandId(id);

	}

	@Override
	public List<CommandeAccess> findByValidatorCode(String code) {
		return commandeAccessDao.findByValidatorCode(code);
	}

	@Override
	@Transactional
	public int deleteByValidatorCode(String code) {
		return commandeAccessDao.deleteByValidatorCode(code);
	}

	@Override
	public List<CommandeAccess> findByValidatorId(Long id) {
		return commandeAccessDao.findByValidatorId(id);

	}

	@Override
	@Transactional
	public int deleteByValidatorId(Long id) {
		return commandeAccessDao.deleteByValidatorId(id);

	}

	@Override
	public CommandeAccess findById(Long id) {
		if (id == null)
			return null;
		return commandeAccessDao.getOne(id);
	}

	@Transactional
	public void deleteById(Long id) {
		commandeAccessDao.deleteById(id);
	}

	@Override
	public CommandeAccess save(CommandeAccess commandeAccess) {
		CommandeAccess ca=new CommandeAccess();

		if (commandeAccess.getCommand() != null) {
			Command command = commandService.findByReference(commandeAccess.getCommand().getReference());
			if(command == null)
				// commandeAccess.setCommand(commandService.save(commandeAccess.getCommand()));
				return null;
			else
				ca.setCommand(command);
		}

		if (commandeAccess.getValidator() != null) {
			User validator = userService.findByCode(commandeAccess.getValidator().getCode());
			if (validator == null)
				// commandeAccess.setValidator(userService.save(commandeAccess.getValidator()));
				return null;
			else
				ca.setValidator(validator);
		}

		return commandeAccessDao.save(ca);
	}

	@Override
	public List<CommandeAccess> save(List<CommandeAccess> commandeAccesss) {
		List<CommandeAccess> list = new ArrayList<CommandeAccess>();
		for (CommandeAccess commandeAccess : commandeAccesss) {
			list.add(save(commandeAccess));
		}
		return list;
	}

	@Override
	public CommandeAccess update(CommandeAccess commandeAccess) {

		CommandeAccess foundedCommandeAccess = findById(commandeAccess.getId());
		if (foundedCommandeAccess == null)
			return null;

		return commandeAccessDao.save(commandeAccess);

	}

	@Override
	@Transactional
	public int delete(CommandeAccess commandeAccess) {

		if (commandeAccess.getId() == null)
			return -1;
		CommandeAccess foundedCommandeAccess = findById(commandeAccess.getId());
		if (foundedCommandeAccess == null)
			return -1;
		commandeAccessDao.delete(foundedCommandeAccess);
		return 1;
	}

	public List<CommandeAccess> findByCriteria(CommandeAccessVo commandeAccessVo) {
		String query = "SELECT o FROM CommandeAccess o where 1=1 ";
		query += SearchUtil.addConstraint("o", "id", "=", commandeAccessVo.getId());
		if (commandeAccessVo.getCommandVo() != null) {
			query += SearchUtil.addConstraint("o", "command.id", "=", commandeAccessVo.getCommandVo().getId());
			query += SearchUtil.addConstraint("o", "command.reference", "LIKE",
					commandeAccessVo.getCommandVo().getReference());
		}

		if (commandeAccessVo.getValidatorVo() != null) {
			query += SearchUtil.addConstraint("o", "validator.id", "=", commandeAccessVo.getValidatorVo().getId());
			query += SearchUtil.addConstraint("o", "validator.code", "LIKE",
					commandeAccessVo.getValidatorVo().getCode());
		}

		return entityManager.createQuery(query).getResultList();
	}

}
